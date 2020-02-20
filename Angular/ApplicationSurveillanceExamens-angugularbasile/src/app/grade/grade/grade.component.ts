import { Component, OnInit } from '@angular/core';
import { Grade } from 'src/app/Model/Grade';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { GradeService } from 'src/app/grade.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-grade',
  templateUrl: './grade.component.html',
  styleUrls: ['./grade.component.css']
})
export class GradeComponent implements OnInit {
  grade: Grade = new Grade();
  myForm = new FormGroup({
    id: new FormControl('', Validators.required),
    nom: new FormControl('', Validators.required),
    quotaSeances: new FormControl('', Validators.required),
    enseignants: new FormControl('', Validators.required),

  });

  constructor(private graService: GradeService) { }
  lstGrades: any[];
  ngOnInit() {
    this.findAll() ;

  }

  ajout(grade: Grade) : void {

    this.graService.ajout(this.grade).subscribe
    (
      data => {
        console.log("Grade ajouté <(^-^<) !!");
      });
  }

  suppr(id: number) : void {

    this.graService.suppr(this.grade).subscribe
    (
      data => {
        console.log( "Grade supprimé <('-'<) !!" );
      });
  }

  modif(grade: Grade) : void {

    this.graService.modif(this.grade).subscribe
    (
      data => {
        console.log( "Grade modifié <('-'<) !!" );
      });
  }

  find(id: number) : Observable<Grade> {
    return
    this.graService.find(this.grade).subscribe
    (
      data => {
        console.log( "Grade trouvé /('-')/ !!" );
      });
  }

  findAll() {
    this.graService.findAll().subscribe(data => {
      this.lstGrades = data;
    },
      error => { console.log(error); });
  }
}