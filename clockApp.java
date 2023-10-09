import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clockApp {
    public static void main(String[] args) {
        new clock();
    }
}
class clock extends JFrame{
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    clock(){
        ImageIcon img = new ImageIcon("clock,png");

        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock App");
        this.setIconImage(img.getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM-dd-yyyy");

        timeLabel = new JLabel();
        timeLabel.setForeground(Color.GREEN);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        timeLabel.setFont(new Font("monospaced", Font.PLAIN, 50));

        dayLabel = new JLabel();
        dayLabel.setForeground(Color.GREEN);
        dayLabel.setFont(new Font("monospaced",  Font.PLAIN, 40));

        dateLabel = new JLabel();
        dateLabel.setForeground(Color.GREEN);
        dateLabel.setFont(new Font("monospaced",  Font.PLAIN, 40));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);

        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}
