export type Transformers = {
  name: string,
  type: string,
  strength: number,
  intelligence: number,
  speed: number,
  endurance: number,
  rank: number,
  courage: number,
  firepower: number,
  skill: number
};

export type BattleApiBody = {
  decepticons: Transformers[],
  autoBots: Transformers[]
};
