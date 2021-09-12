import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Position} from "./Position";

@Injectable({
  providedIn: 'root'
})
export class PositionService {
  readonly URL_API = "http://localhost:3000/position";
  constructor(private httpClient: HttpClient) { }
  getAllPosition():Observable<Position[]>{
    return this.httpClient.get<Position[]>(this.URL_API);
  }
}
