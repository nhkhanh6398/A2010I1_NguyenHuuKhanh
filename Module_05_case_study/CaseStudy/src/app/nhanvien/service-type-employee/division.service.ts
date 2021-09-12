import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Division} from "./Division";

@Injectable({
  providedIn: 'root'
})
export class DivisionService {
  readonly URL_API =" http://localhost:3000/division";
  constructor(private httpClient:HttpClient) { }
  getAllDivision():Observable<Division[]>{
    return this.httpClient.get<Division[]>(this.URL_API);
  }
}
