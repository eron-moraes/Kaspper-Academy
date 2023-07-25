import { CanActivateFn, Router } from '@angular/router';
import { AuthService } from './auth.service';
import { inject } from '@angular/core';

export const authGuard: CanActivateFn = (route, state) => {
  let authService = inject(AuthService);
  let router = inject(Router);
  let loggedIn = authService.isLoggedIn;
  if(loggedIn){
    return true;
  }else {
    router.navigate(['/login']);
    return false;
  }
};
