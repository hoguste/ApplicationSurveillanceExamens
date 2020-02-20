import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Seance } from './Model/Seance';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SeanceService {

  constructor(private http:HttpClient) { }

  ajout(seance: Seance): Observable<any> {
    return this.http.post('http:localhost:8070/seance/ajout', seance);
  }

  suppr(seance: Seance): Observable<any> {
    return this.http.delete('http:localhost:8070/seance/suppr'+ seance.id);
  }

  modif(seance: Seance) : Observable<any> {
    return this.http.post('http:localhost:8070/seance/modif', seance);
  }seance

  find(seance: Seance) : Observable<any> {
    return this.http.get('http:localhost:8070/seance/find'+ seance.id);
  }

  findAll(): Observable<any> {
    return this.http.get('http:localhost:8070/seance/findAll');


}
}
