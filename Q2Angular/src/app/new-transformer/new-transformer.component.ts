import {Component, OnInit} from '@angular/core';
import {addToAutoBot, addToDecepticons, Transformers, TYPE} from '../model/Transformers';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-new-transformer',
  templateUrl: './new-transformer.component.html',
  styleUrls: ['./new-transformer.component.css']
})
export class NewTransformerComponent implements OnInit {

  transformer: Transformers = {
    name: '',
    type: 'AUTOBOT',
    strength: 1,
    intelligence: 1,
    courage: 1,
    endurance: 1,
    firepower: 1,
    rank: 1,
    skill: 1,
    speed: 1
  };

  constructor(private route: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit(): void {
    this.transformer.type = (this.route.snapshot.paramMap.get('type') as TYPE);
  }

  onSubmit(transformerForm) {
    if (this.transformer.type === 'AUTOBOT') {
      addToAutoBot(this.transformer);
    } else {
      addToDecepticons(this.transformer);
    }
    this.router.navigate(['/']);
  }

}
