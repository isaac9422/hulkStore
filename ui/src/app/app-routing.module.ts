import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './shared/components/home/home.component';
import {PagenotfoundComponent} from './shared/components/pagenotfound/pagenotfound.component';
import {MainScreenComponent} from "./shared/components/main-screen/main-screen.component";

const routes: Routes = [
  {
    path: '', component: MainScreenComponent,
    children: [
      {path: '', component: HomeComponent},
      {path: 'venta', loadChildren: './venta/venta.module#VentaModule'},
      {path: 'admin', loadChildren: './admin/admin.module#AdminModule'},
      {path: '**', component: PagenotfoundComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
