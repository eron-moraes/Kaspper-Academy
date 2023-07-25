import { Component, OnInit, inject } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import { LogoComponent } from "../../shared/logo/logo.component";
import { AuthService } from 'src/app/services/auth.service';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.scss'],
    standalone: true,
    imports: [CommonModule, MatToolbarModule, MatButtonModule, MatIconModule, LogoComponent]
})
export class HeaderComponent implements OnInit {

  auth =inject(AuthService);

  ngOnInit(): void{
    console.log(`Está logado? ${this.auth.isLoggedIn}`);
  }

}
