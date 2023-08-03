import { Component, OnDestroy, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuariosService } from 'src/app/services/usuarios.service';
import { Usuario } from 'src/app/models/usuario.model';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatTableModule} from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-usuario',
  standalone: true,
  imports: [CommonModule, MatToolbarModule, MatTableModule, MatButtonModule, FormsModule, ReactiveFormsModule, MatFormFieldModule, MatInputModule, MatCardModule, MatIconModule],
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.scss']
})
export class UsuarioComponent implements OnInit {
  usuarioService = inject(UsuariosService);
  usuarios:Usuario[] = [];
  colunas: string[] = ["nome", "email"];

  usuario:Usuario = {};

  form!:FormGroup;
  fb = inject(FormBuilder);

  ngOnInit(): void {
    this.carregaUsuarios();
    this.createForm();
  }

  save(){
    console.log(this.form.value);
  }

  createForm(){
    this.form = this.fb.group({
      id: [''],
      nome:['', [Validators.required, Validators.min(5)]],
      email: ['',[Validators.required, Validators.email]]
    })
  }

  carregaUsuarios(){
    this.usuarioService
                        .getUsuarios()
                        .subscribe(dados => (this.usuarios = dados));
  }

  novoUsuario(){

  }

}
