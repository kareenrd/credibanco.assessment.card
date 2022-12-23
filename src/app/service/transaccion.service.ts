import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Transaccion } from './../model/transaccion';

@Injectable({
  providedIn: 'root'
})
export class TransaccionService {

  private url: string = 'http://localhost:8080/transaccion';

  constructor(private http:HttpClient) { }

  listar(){
    return this.http.get<Transaccion[]>(this.url);
  }
}
