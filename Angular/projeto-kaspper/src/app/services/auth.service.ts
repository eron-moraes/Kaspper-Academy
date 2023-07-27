import { Injectable, inject, signal } from '@angular/core';
import { Router } from '@angular/router';
import { UserModel } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  getUfs() {
    throw new Error('Method not implemented.');
  }

  // Nova abordagem para injeção de dependências
  router = inject(Router);

  // private loggedIn: BehaviorSubject<boolean>
  // Usando Reatividade com signal
  loggedIn = signal(false);

  get isLoggedIn(): boolean {
    return this.loggedIn();
  }

  login(user: UserModel): void {
    // Setar usuário
    localStorage.setItem("user", JSON.stringify(user));
    this.loggedIn.update((value) => (value = true));
    this.router.navigate(['/']);
  }

  logout(): void {
    localStorage.removeItem("user");
    this.loggedIn.update((value) => value = false);
    this.router.navigate(['/login']);
  }

}
