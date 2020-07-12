import { Component, OnInit } from '@angular/core';
import {Transformers} from '../model/Transformers';

@Component({
  selector: 'app-battle',
  templateUrl: './battle.component.html',
  styleUrls: ['./battle.component.css']
})
export class BattleComponent implements OnInit {

  deceptions: Transformers[] = [];
  autoBots: Transformers[] = [];
  showNewDeception = false;

  constructor() { }

  ngOnInit(): void {
  }

  addToDeception(newDeception: Transformers): void {
    this.deceptions.push(newDeception);
  }

  addToAutoBots(newAutoBot: Transformers): void {
    this.autoBots.push(newAutoBot);
  }

}
