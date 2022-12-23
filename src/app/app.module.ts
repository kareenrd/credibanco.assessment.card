import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TarjetaComponent } from './view/tarjeta/tarjeta.component';
import { HttpClientModule } from '@angular/common/http';

import {MatTableModule} from '@angular/material/table';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { TransaccionComponent } from './view/transaccion/transaccion.component';

@NgModule({
  declarations: [
    AppComponent,
    TarjetaComponent,
    TransaccionComponent
  ],
  imports: [
  BrowserModule,
    HttpClientModule,
    MatTableModule,
    MatButtonModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
