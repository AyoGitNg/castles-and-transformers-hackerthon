package com.ayodele.aquilibrium.model;

import java.util.List;
import java.util.Objects;

public class TransformersParams {

    private List<Decepticons> decepticons;
    private List<Autobot> autoBots;

    public TransformersParams(List<Decepticons> decepticons, List<Autobot> autoBots) {
        this.decepticons = decepticons;
        this.autoBots = autoBots;
    }

    public List<Decepticons> getDecepticons() {
        return decepticons;
    }

    public void setDecepticons(List<Decepticons> decepticons) {
        this.decepticons = decepticons;
    }

    public List<Autobot> getAutoBots() {
        return autoBots;
    }

    public void setAutoBots(List<Autobot> autoBots) {
        this.autoBots = autoBots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransformersParams that = (TransformersParams) o;
        return Objects.equals(decepticons, that.decepticons) &&
                Objects.equals(autoBots, that.autoBots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decepticons, autoBots);
    }

    @Override
    public String toString() {
        return "TransformersParams{" +
                "decepticons=" + decepticons +
                ", autoBots=" + autoBots +
                '}';
    }
}
