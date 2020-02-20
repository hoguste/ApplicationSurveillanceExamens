import { FormGroup, FormControl, Validators } from '@angular/forms';
import { AdminService } from 'src/app/admin.service';
import { Admin } from 'src/app/Model/Admin';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  admin: Admin = new Admin();
  myForm = new FormGroup({
    id: new FormControl('', Validators.required),
    nom: new FormControl('', Validators.required),
    prenom: new FormControl('', Validators.required),
    master: new FormControl('', Validators.required),
    numTel: new FormControl('', Validators.required),
    mail: new FormControl('', Validators.required),
    adresse: new FormControl('', Validators.required),
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    role: new FormControl('', Validators.required),

  })

  constructor(private admService:AdminService) { }
  lstAdmins: any[];

  ngOnInit() {
    this.findAll() ;

  }

  ajout(admin: Admin) : void {

    this.admService.ajout(this.admin).subscribe
    (
      data => {
        console.log("Admin ajouté ");
      });
  }

  suppr(id: number) : void {

    this.admService.suppr(this.admin).subscribe
    (
      data => {
        console.log( "Admin supprimé " );
      });
  }

  modif(admin: Admin) : void {

    this.admService.modif(this.admin).subscribe
    (
      data => {
        console.log( "Admin modifié <('-'<) !!" );
      });
  }

  find(id: number) : Observable <Admin>{

    return
      this.admService.find(this.admin).subscribe(data => {
        console.log( "Admin trouvé /('-')/ !!" );
      });
    
    
  }

  findAll() {
    this.admService.findAll().subscribe(data => {
      this.lstAdmins = data;
    },
      error => { console.log(error); });
  }
}
