import { Component , OnInit} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table'
import { TransaccionService } from './../../service/transaccion.service';
import { Transaccion } from './../../model/transaccion';

@Component({
  selector: 'app-transaccion',
  templateUrl: './transaccion.component.html',
  styleUrls: ['./transaccion.component.css']
})
export class TransaccionComponent implements OnInit{

  displayedColumns = ['idTransaccion', 'tipo', 'fecha', 'noReferencia', 'estado', 'total', 'dreccion','editar-eliminar'];
  dataSource!: MatTableDataSource<Transaccion>;

  //Transaccion: Transaccion[] = [];

  constructor(private transaccionService: TransaccionService){}

  ngOnInit(): void{
    //this.transaccionService.listar().subscribe(data => this.Transaccion=data);
    this.transaccionService.listar().subscribe(data => {this.dataSource = new MatTableDataSource(data)});
  }

}
