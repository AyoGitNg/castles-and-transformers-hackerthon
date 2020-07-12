import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {BattleApiBody} from './model/Transformers';

const URL = 'http://localhost:8080/api/battle';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  battleApi(body: BattleApiBody): Observable<any> {
    return this.http.post<any>(URL, body);
  }

}
