package controllers;

import models.Mark;

public class MarkController {
    public Mark createMark() {
        return new Mark();
    }

    public void updateFirstAttestation(Mark mark, double score) {
        mark.setFirstAttestation(score);
    }

    public void updateSecondAttestation(Mark mark, double score) {
        mark.setSecondAttestation(score);
    }

    public void updateFinalExam(Mark mark, double score) {
        mark.setFinalExam(score);
    }

    public void displayMarkDetails(Mark mark) {
        System.out.println("First Attestation: " + mark.getFirstAttestation());
        System.out.println("Second Attestation: " + mark.getSecondAttestation());
        System.out.println("Final Exam: " + mark.getFinalExam());
    }
}