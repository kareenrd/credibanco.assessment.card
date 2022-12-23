import { Component , OnInit} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table'
import { TarjetaService } from './../../service/tarjeta.service';
import { Tarjeta } from './../../model/tarjeta';

@Component({
  selector: 'app-tarjeta',
  templateUrl: './tarjeta.component.html',
  styleUrls: ['./tarjeta.component.css']
})
export class TarjetaComponent implements OnInit{

  displayedColumns = ['idTarjeta', 'pan', 'titular', 'cedula', 'tipo', 'telefono', 'estado','editar-eliminar'];
  dataSource!: MatTableDataSource<Tarjeta>;

  //Tarjeta: Tarjeta[] = [];

  constructor(private tarjetaService: TarjetaService){}

  ngOnInit(): void{
    //this.tarjetaService.listar().subscribe(data => this.Tarjeta=data);
    this.tarjetaService.listar().subscribe(data => {this.dataSource = new MatTableDataSource(data)});
  }

}
