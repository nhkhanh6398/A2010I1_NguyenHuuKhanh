import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Education} from "./Education";

@Injectable({
  providedIn: 'root'
})
export class EducationService {
  readonly URL_API = "http://localhost:3000/education";
  constructor(private httpClient:HttpClient) { }

  getAllEducation():Observable<Education[]>{
    return this.httpClient.get<Education[]>(this.URL_API);
  }
}
