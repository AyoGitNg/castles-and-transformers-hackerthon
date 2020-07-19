import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BattleComponent} from './battle/battle.component';
import {NewTransformerComponent} from './new-transformer/new-transformer.component';


const routes: Routes = [
  {path: '', component: BattleComponent},
  {path: 'battle', component: BattleComponent},
  {path: 'new', component: NewTransformerComponent},
  {path: '**', component: BattleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
