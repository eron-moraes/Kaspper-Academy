import { Component, OnDestroy, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuariosService } from 'src/app/services/usuarios.service';
import { Usuario } from 'src/app/models/usuario.model';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatTableModule} from '@angular/material/table';

@Component({
  selector: 'app-usuario',
  standalone: true,
  imports: [CommonModule, MatToolbarModule, MatTableModule],
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.scss']
})
export class UsuarioComponent implements OnInit {
  usuarioService = inject(UsuariosService);
  usuarios:Usuario[] = [];
  colunas: string[] = ["nome", "email"];

  ngOnInit(): void {
    this.carregaUsuarios();
  }

  carregaUsuarios(){
    this.usuarioService
                        .getUsuarios()
                        .subscribe(dados => (this.usuarios = dados));
  }

}
