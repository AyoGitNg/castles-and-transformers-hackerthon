package com.ayodele.aquilibrium.api;

import com.ayodele.aquilibrium.model.BattleResult;
import com.ayodele.aquilibrium.model.TransformersParams;
import com.ayodele.aquilibrium.service.Battle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class BattleApi {

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/battle")
    public ResponseEntity<?> getBattleResult(@RequestBody TransformersParams transformersParams) {
        Battle battle = new Battle(transformersParams.getDecepticons(),transformersParams.getAutoBots());
        BattleResult battleResult = battle.fight();
        return ResponseEntity.ok(battleResult);
    }

}
