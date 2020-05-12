import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from "../Modelo/Persona";
import { Observable } from 'rxjs';
import { Doorkey } from '../Modelo/Doorkey';

@Injectable({
  providedIn: 'root'
})
export class DoorkeyService {

  constructor(private http:HttpClient) { }

  //host de backend, la barra '/' sola es el home//host de backend, la barra '/' sola es el home
  private Url:string="https://keys-app-mobydigital.herokuapp.com/api";
  //private Url:string="http://localhost:8081/api";

  getDoorkeys():Observable<Doorkey[]> {
    return this.http.get<Doorkey[]>(this.Url+"/doorkeys"); //obtengo todos los datos de la URL de arriba, que se refiere al backend
  }
  
}