package Task3.application;

/** DTO запиту від CLI. */
public record ScheduleAppointmentCommand(String patientName, String doctorCategory) { }
