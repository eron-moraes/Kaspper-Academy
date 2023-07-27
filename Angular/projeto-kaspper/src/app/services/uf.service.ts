import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UfService {

  private API_UFS = "https://servicodados.ibge.gov.br/api/v1/localidades/estados"

  http = inject(HttpClient);

  getUfs(){
    return this.http.get(this.API_UFS);
  }

}
