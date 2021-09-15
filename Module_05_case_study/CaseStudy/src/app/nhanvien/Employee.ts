import {Education} from "./service-type-employee/Education";
import {Division} from "./service-type-employee/Division";
import {Position} from "./service-type-employee/Position";

export interface Employee {
  id: string,
  name: string,
  birthday: string,
  idCard: string,
  salary: number,
  phone: string,
  email: string,
  address: string,
  education: Education,
  division: Division,
  position: Position,
}
