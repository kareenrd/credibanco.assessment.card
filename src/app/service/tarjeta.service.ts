import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Tarjeta } from './../model/tarjeta';

@Injectable({
  providedIn: 'root'
})
export class TarjetaService {

  private url: string = 'http://localhost:8080/tarjeta';

  constructor(private http:HttpClient) { }

  listar(){
    return this.http.get<Tarjeta[]>(this.url);
  }
}
