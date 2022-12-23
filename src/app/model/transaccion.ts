import { Tarjeta } from "./tarjeta";

export class Transaccion{
  idTransaccion!: number;
  tipo!: number;
  fecha!: string;
  noReferencia!: number;
  estado!: number;
  total!: number;
  direccion!: string;
  idTarjeta!: Tarjeta;
}
