export type TYPE = 'DECEPTICON' | 'AUTOBOT';

export type Transformers = {
  name: string,
  type: TYPE,
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

export let autoBots: Transformers[] = [];
export let decepticons: Transformers[] = [];

export const addToAutoBot = (autoBot: Transformers) => {
  autoBots = [...autoBots, autoBot];
};

export const addToDecepticons = (decepticon: Transformers) => {
  decepticons = [...decepticons, decepticon];
};
