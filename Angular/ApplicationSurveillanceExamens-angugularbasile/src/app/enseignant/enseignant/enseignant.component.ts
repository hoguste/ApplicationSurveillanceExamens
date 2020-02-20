import { Component, OnInit } from '@angular/core';
import { Enseignant } from 'src/app/Model/Enseignant';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { EnseignantService } from 'src/app/enseignant.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-enseignant',
  templateUrl: './enseignant.component.html',
  styleUrls: ['./enseignant.component.css']
})
export class EnseignantComponent implements OnInit {
  enseignant: Enseignant = new Enseignant();
  myForm = new FormGroup({
    id: new FormControl('', Validators.required),
    nom: new FormControl('', Validators.required),
    prenom: new FormControl('', Validators.required),
    grade: new FormControl('', Validators.required),
    matiere: new FormControl('', Validators.required),
    adresse: new FormControl('', Validators.required),
    numTel: new FormControl('', Validators.required),
    mail: new FormControl('', Validators.required),
    seance1: new FormControl('', Validators.required),
    seance2: new FormControl('', Validators.required),
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    role: new FormControl('', Validators.required),

  });

  constructor(private ensService: EnseignantService) { }
  lstEnseignants: any[];
  ngOnInit() {
    this.findAll() ;

  }

  ajout(enseignant: Enseignant) : void {

    this.ensService.ajout(this.enseignant).subscribe
    (
      data => {
        console.log("Enseignant ajouté <(^-^<) !!");
      });
  }

  suppr(id: number) : void {

    this.ensService.suppr(this.enseignant).subscribe
    (
      data => {
        console.log( "Enseignant supprimé <('-'<) !!" );
      });
  }

  modif(enseignant: Enseignant) : void {

    this.ensService.modif(this.enseignant).subscribe
    (
      data => {
        console.log( "Enseignant modifié <('-'<) !!" );
      });
  }

  find(id: number) : Observable<Enseignant> {
  return
    this.ensService.find(this.enseignant).subscribe
    (
      data => {
        console.log( "Enseignant trouvé /('-')/ !!" );
      });
  }

  findAll() {
    this.ensService.findAll().subscribe(data => {
      this.lstEnseignants = data;
    },
      error => { console.log(error); });
  }
}
