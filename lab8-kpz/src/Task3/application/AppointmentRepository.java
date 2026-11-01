package Task3.application;

import Task2.Appointment;

/** Indirection: контролер не знає, куди саме зберігається запис. */
public interface AppointmentRepository {
    void save(Appointment appointment);
}
