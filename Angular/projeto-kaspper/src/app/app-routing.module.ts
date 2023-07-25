import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { authGuard } from './services/auth.guard';

const routes: Routes = [
  {
    path: 'login',
    //component: LoginComponent (Carrega o componente na inicialização do projeto)
    loadComponent: () =>
      import('./components/login/login.component').then(x => x.LoginComponent)
  },

  {
    path: '',
    loadComponent:()=>
    import('./components/admin/homr/homr.component').then(x => x.HomrComponent),
    canActivate:[authGuard]
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
