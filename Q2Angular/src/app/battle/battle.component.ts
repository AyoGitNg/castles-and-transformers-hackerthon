import {ChangeDetectorRef, Component, OnInit} from '@angular/core';
import {autoBots, BattleApiBody, decepticons} from '../model/Transformers';
import {ActivatedRoute, Router} from '@angular/router';
import {ApiService} from '../api-service';

@Component({
  selector: 'app-battle',
  templateUrl: './battle.component.html',
  styleUrls: ['./battle.component.css']
})
export class BattleComponent implements OnInit {
  currentDecepticons;
  currentAutoBots;

  numberOfBattles: number;
  winnerTeam: string;
  survivors: string[];

  constructor(private route: ActivatedRoute,
              private router: Router,
              private apiService: ApiService,
              private cd: ChangeDetectorRef) {
  }

  ngOnInit(): void {
    console.log(decepticons, autoBots);
    this.currentDecepticons = [...decepticons];
    this.currentAutoBots = [...autoBots];
  }


  newDeception(): void {
    this.router.navigate(['/new', {type: 'DECEPTICON'}]);
  }

  newAutoBots(): void {
    this.router.navigate(['/new', {type: 'AUTOBOT'}]);
  }

  fight() {
    const body: BattleApiBody = {
      decepticons,
      autoBots
    };
    const result = this.apiService.battleApi(body);
    result.subscribe((data) => {
      console.log(data);
      this.numberOfBattles = data.numberOfBattles;
      this.survivors = data.survivors;
      this.winnerTeam = data.winnerTeam;
    });
  }

}
