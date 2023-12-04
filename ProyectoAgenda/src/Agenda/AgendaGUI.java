package Agenda;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgendaGUI extends JFrame {

    private JPanel Background;
    private JTextField NombreEvento;
    private JComboBox<String> tipoEventoComboBox;
    private JComboBox<String> prioridadComboBox;
    private JButton agregarButton;
    private JList<String> tareaList;
    private DefaultListModel<String> listModel;
    private JDateChooser dateChooser;

    private agenda agenda;

    public AgendaGUI() {
        super("Agenda App");
        agenda = new agenda("", Calendar.getInstance(), "");
        listModel = new DefaultListModel<>();

        NombreEvento = new JTextField(20);
        NombreEvento.setText("");
        tipoEventoComboBox = new JComboBox<>(new String[]{"Tarea", "Examen", "Trabajo", "Tramite", "Otro"});
        prioridadComboBox = new JComboBox<>(new String[]{"Urgente", "Media", "Baja"});
        agregarButton = new JButton("Agregar Tarea");
        tareaList = new JList<>(listModel);
        dateChooser = new JDateChooser();

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarTarea();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nombre"));
        panel.add(NombreEvento);
        panel.add(new JLabel("Tipo de Evento:"));
        panel.add(tipoEventoComboBox);
        panel.add(new JLabel("\nPrioridad:"));
        panel.add(prioridadComboBox);
        panel.add(new JLabel("Fecha:"));
        panel.add(dateChooser);
        panel.add(agregarButton);

        add(panel);
        setSize(400, 500);
        //setLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void agregarTarea() {
        String Nombre =  NombreEvento.getText();
        String tipoEvento = (String) tipoEventoComboBox.getSelectedItem();
        String prioridad = (String) prioridadComboBox.getSelectedItem();
        Date selectedDate = dateChooser.getDate();

        Calendar fecha = Calendar.getInstance();
        fecha.setTime(selectedDate);

        agenda nuevaTarea = new agenda(tipoEvento, fecha, prioridad);

        switch (prioridad.toLowerCase()) {
            case "urgente":
                agenda.agregarUrgente(nuevaTarea);
                break;
            case "media":
                agenda.agregarMedia(nuevaTarea);
                break;
            case "baja":
                agenda.agregarBaja(nuevaTarea);
                break;
            default:
                break;
        }

        tipoEventoComboBox.setSelectedIndex(0);
        dateChooser.setDate(null);
    }
}