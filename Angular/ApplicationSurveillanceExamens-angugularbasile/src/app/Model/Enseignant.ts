import { Grade } from './Grade';
import { Seance } from './Seance';

export class Enseignant{

id:number;
nom:string;
prenom:string;
grade:Grade;
matiere:string;
adresse:string;
numTel:string;
mail:string;
seance1:Seance[];
seance2:Seance[];
username:string;
password:string;
role:string;


}