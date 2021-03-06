import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RegistrationFormComponent} from "../pages/registration-form/registration-form.component";
import {HomeComponent} from "../pages/home/home.component";
import {ContactComponent} from "../contacts/contact/contact.component";
import {LoginFormComponent} from "../pages/login-form/login-form.component";
import {RouterModule, Routes} from "@angular/router";
import {AuthGuard} from "../auth.guard";
import {NouveauComponent} from "../message/nouveau/nouveau.component";
import {ContactsModule} from "../contacts/contacts.module";

const appRoutes: Routes = [
  {
    path: 'login',
    component: LoginFormComponent
  },
  {
    path: 'contacts',
    canActivate: [AuthGuard],
    component: ContactComponent
  },
  {
    path: 'nouveau',
    canActivate: [AuthGuard],
    component: NouveauComponent
  },
  {
    path: 'home',
    canActivate: [AuthGuard],
    component: HomeComponent
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path: 'registration',
    component: RegistrationFormComponent

  }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(
      appRoutes,
      {useHash: true}
    )
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
