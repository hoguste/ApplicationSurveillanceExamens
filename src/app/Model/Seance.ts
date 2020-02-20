import { Enseignant } from './Enseignant';
import { Salle } from './Salle';

export class Seance{

    id:number;
    type:string;
    dateDebut:Date;
    dateFin:Date;
    duree:number;
    matiere:string;
    enseignant1:Enseignant;
    enseignant2:Enseignant;
    salle:Salle;

}