import { HttpClient } from '@angular/common/http';
import { Inject, Injectable, inject } from '@angular/core';
import { Usuario } from '../models/usuario.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private API_USUARIO ='http://localhost:8080/usuarios';

  http = inject(HttpClient);

  getUsuarios(): Observable<Usuario[]>{
    return this.http.get<Usuario[]>(this.API_USUARIO);
  }

  crate(data: Usuario){
    return this.http.post<Usuario>(this.API_USUARIO, data);
  }


  update(data:Usuario){
  return this.http.put(this.API_USUARIO, data);
  }

  delete(id:string){
    return this.http.delete(`${this.API_USUARIO}/${id}`);
  }
}
