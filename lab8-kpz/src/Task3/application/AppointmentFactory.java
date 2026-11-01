package Task3.application;

import Task2.Appointment;
import Task2.Doctor;
import Task2.Patient;

/** Pure Fabrication: збирає запис із даних команди (замість БД/довідника — заглушка з legacy-коду). */
public class AppointmentFactory {
    private int nextId = 3001;

    public Appointment create(ScheduleAppointmentCommand command) {
        Patient patient = Patient.insured(22, command.patientName(), "INS-99201", "+380684445566");
        Doctor doctor = Doctor.create(101, "Др. Ковальчук", "Кардіолог", command.doctorCategory(), 800.0);
        return Appointment.schedule(nextId++, patient, doctor);
    }
}
