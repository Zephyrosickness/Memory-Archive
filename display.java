import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//contains most graphical data
//welcome to hell

public class display extends JFrame {
    //init var
    public static int combo;
    public static double cc;
    public static JCheckBox toa;
    public static List<ScoreTextArea> scoreTextArray = new ArrayList<>();

    /*ppl keep saying static vars are bad and i mean thats probably true because of something something nerd stuff idk about but um im bad at coding and i keep
    having problems idk how to fix without static vars idek why theyre bad but um maybe one day ill be good at coding and it will be fixed*/

    public static void main(String[] args) {
        //changes l&f to windows classic because im a basic bitch like that
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            //error handler for l&f in case something doesnt work
            System.out.println("error with look and feel");
        }


        // create a window
        JFrame frame = new JFrame("The Memory Archive");
        frame.setSize(700, 700);

        //score display

        //make new panel this will have the scores in it
        JPanel scorePanel = new JPanel();
        scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));

        // Create a JScrollPane and add the content panel to it
        JScrollPane scoreDisplay = new JScrollPane(scorePanel);
        scoreDisplay.setBounds(350, 0, 325, 650);

        // Add the scroll pane to the frame
        frame.add(scoreDisplay);

        //main panel to hold components
        JPanel panel = new JPanel();

        //adds panel
        frame.add(panel);
        panel.setBounds(0, 0, 350, 700);
        frame.setResizable(false);
        songInfoComponents(panel, scorePanel);
        frame.setVisible(true);
    }

    //panel to hold components
    public static void songInfoComponents(JPanel panel, JPanel scorePanel) {

        // set the layout manager to null for absolute positioning
        panel.setLayout(null);



        ///LABELS





        //chart info/select labels


        //-label for chart dropdown
        JLabel chartTitle = new JLabel("Chart");
        chartTitle.setBounds(112, 5, 80, 25);
        panel.add(chartTitle);

        //label that displays the jacket
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(25, 70, 200, 200);
        panel.add(imageLabel);
        

        //-label for notecount
        JLabel noteCount = new JLabel("Max Combo:");
        noteCount.setBounds(25, 410, 80, 25);
        panel.add(noteCount);

        //-label for chart constant
        JLabel chartConstant = new JLabel("Chart Constant:");
        chartConstant.setBounds(25, 430, 150, 25);
        panel.add(chartConstant);

        //-label for perfect pure info
        JLabel pureInfo = new JLabel("*Note that this doesn't use perfect PUREs, so scores may be slightly off.");
        pureInfo.setBounds(25, 630, 500, 25);
        panel.add(pureInfo);


        //filter option labels


        //label for far filter
        JLabel farLabel = new JLabel("FAR count");
        farLabel.setBounds(25, 450, 150, 25);
        panel.add(farLabel);

        //label for lost filter
        JLabel lostLabel = new JLabel("LOST count");
        lostLabel.setBounds(25, 480, 150, 25);
        panel.add(lostLabel);

        //label for min score
        JLabel scoreLabel = new JLabel("Minimum score");
        scoreLabel.setBounds(25, 510, 150, 25);
        panel.add(scoreLabel);

        //label for sorter
        JLabel sortLabel = new JLabel("Sort by");
        sortLabel.setBounds(25, 540, 80, 25);
        panel.add(sortLabel);



        //DROPDOWNS



        //array vars (dropdown options)


        //diff name
        String[] difficultyList = {"FTR/ETR", "BYD"};
        //for op dropdowns
        String[] operators = {"=","<", "Any"};

        //for sort dropdown
        String[] sorts = {"Score","FAR count", "LOST count"};


        //chart select dropdowns


        //difficulty select dropdown
        JComboBox<String> difficultySelect = new JComboBox<>(difficultyList);
        difficultySelect.setBounds(250, 25, 75, 25);
        panel.add(difficultySelect);

        //charts
        String[] charts = songsDatabase.chartsAll;

        //chart select dropdown
        final JComboBox<String> songSelect = new JComboBox<>(charts);
        songSelect.setBounds(50, 25, 200, 25);
        panel.add(songSelect);


        //filter dropdowns


        //dropdown for operator on far count
        final JComboBox<String> farOperator = new JComboBox<>(operators);
        farOperator.setBounds(74, 450,  50, 25);
        panel.add(farOperator);

        //dropdown for operator on miss count
        final JComboBox<String> missOperator = new JComboBox<>(operators);
        missOperator.setBounds(74, 480,  50, 25);
        panel.add(missOperator);

        //select sorting methodology dropdown
        final JComboBox<String> sorter = new JComboBox<>(sorts);
        sorter.setBounds(65, 540,  100, 25);
        panel.add(sorter);




        //filter fields


        //field for far count
        JTextField farField = new JTextField("0");
        farField.setBounds(120, 450, 25, 25);
        panel.add(farField);

        //field for lost count
        JTextField lostField = new JTextField("0");
        lostField.setBounds(122, 480, 25, 25);
        panel.add(lostField);

        //field for minimum score
        JTextField scoreField = new JTextField("0");
        scoreField.setBounds(92, 510, 75, 25);
        panel.add(scoreField);

        ///BUTTONS

        //checkbox if ur using that bitch from spiders thread
        toa = new JCheckBox("Using Toa Kozukata");
        toa.setBounds (25,570,125,25);
        panel.add(toa);

        //button to run score calcs
        JButton run = new JButton("Find scores");
        run.setBounds(25, 600, 100, 25);
        panel.add(run);

        //refreshes on initalization
        refresh(songSelect, imageLabel, noteCount, chartConstant, (String)difficultySelect.getSelectedItem());

        //ACTIONS

        //loads chart / refreshes song data (songSelect dropdown)
        songSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                refresh(songSelect, imageLabel, noteCount, chartConstant, (String)difficultySelect.getSelectedItem());
            }
        });

        //load byd/ftr charts (diffSelect dropdown)
        difficultySelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] list = null;
                    if(difficultySelect.getSelectedItem()=="BYD"){
                        list = songsDatabase.chartsBYD;
                    }else{
                        list = songsDatabase.chartsAll;
                    }
                songSelect.setModel(new JComboBox<>(list).getModel());
            }
        });

        //calculates scores (run button)
        run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //clear the board before running new calcs
                scoreTextArray.clear();

                //init var (mostly reading off fields and dropdowns)
                int far = Integer.parseInt(farField.getText());
                int miss = Integer.parseInt(lostField.getText());
                String minScore = (String)(scoreField.getText());
                String farOp = (String)farOperator.getSelectedItem();
                String missOp = (String)missOperator.getSelectedItem();

                //runs func to calc score
                /*THIS SHIT USED TO BE SO LONG AND AWFUL AND I HAD NO IDEA HOW TO GET IT INTO ITS OWN CLASS AND IT WAS OVER HALF THE ENTIRE PROGRAM BUT
                 * I DID NOW ITS WAY SHORTER AND IN ITS OWN CLASS IM IM SUCH A GENIUS IM LITERALLY A PRODIGY OH MY GOD
                 */
                score.calcScore(minScore, far, miss, farOp, missOp);

                //sort results based on the sort option
                switch((String)sorter.getSelectedItem()) {
                    case "Score":
                        scoreTextArray.sort(Comparator.comparingDouble(ScoreTextArea::getScore).reversed());
                        break;
                    case "FAR count":
                        scoreTextArray.sort(Comparator.comparingInt(ScoreTextArea::getFar).reversed());
                        break;
                    case "LOST count":
                        scoreTextArray.sort(Comparator.comparingInt(ScoreTextArea::getMiss).reversed());
                        break;
                }

                //removes all components from scorePanel so scores dont stack
                scorePanel.removeAll();

                //add sorted components to the scorePanel
                for (ScoreTextArea textAreas : scoreTextArray) {
                    scorePanel.add(textAreas);
                }

                //update the scroll pane after adding components
                scorePanel.revalidate();
                scorePanel.repaint();

            }
        });


    }
    //refreshes song data
    public static void refresh(JComboBox<String> songSelect, JLabel imageLabel, JLabel noteCount, JLabel chartConstant, String difficulty) {

        String selected = (String) songSelect.getSelectedItem();
        File jacket = null;

        //sets up jacket


        //looking at this awful if-loop in particular makes me wanna quit and go to bed its awful and i could do something better but i dont care
        Path path = Paths.get("./assets/"+checksum(selected)+".jpg");

        if(Files.exists(path) ==false){
            jacket = new File("./assets/placeholder.jpg");
        }else{
            if(difficulty=="BYD"){
                //adds "_byd" to the end of the jpeg file name it's looking for if the diff is set to byd

                path = Paths.get("./assets/"+checksum(selected)+"_byd"+".jpg");

                //if a byd version of the jacket does not exist, or if the diff isnt set to byd, do not add "_byd" to the end of the target filename
                if(Files.exists(path) ==false){
                    //if the byd jacket does not exist
                    jacket = new File("./assets/"+checksum(selected)+".jpg");
                }else{
                    //if the byd jacket exists
                    jacket = new File("./assets/"+checksum(selected)+"_byd"+".jpg");
                }
            }else{
                //if diff isnt set to byd, it doesnt add beyond to the end
                jacket = new File("./assets/"+checksum(selected)+".jpg");
            }
    }

        songsDatabase.db(selected, difficulty);


        try {
            BufferedImage img = ImageIO.read(jacket);

            int scaledWidth = 325;
            int scaledHeight = -1;  //set to -1 so aspect ratio will be preserved
            Image resizedImg = img.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

            //replaces jacket
            ImageIcon imageIcon = new ImageIcon(resizedImg);
            imageLabel.setIcon(imageIcon);
            imageLabel.setBounds(12, 70, scaledWidth, resizedImg.getHeight(null));
            //error handler in case of invalid url
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
        }

        //update constant/combo

        noteCount.setText("Max Combo: " + combo);
        chartConstant.setText("Chart Constant: " + cc);
    }

    //holds data for each play listing
    public static class ScoreTextArea extends JTextArea {
        private double score;
        private double far;
        private double miss;

        public ScoreTextArea(String text, double score, int far, int miss) {
            //variables for each score container
            super(text);
            this.score = score;
            this.far = far;
            this.miss = miss;
            setLineWrap(true);
            setWrapStyleWord(true);
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //setMaximumSize(new Dimension(300, 60));
        }

        public double getScore() {
            return score;
        }
        public int getFar() {
            return (int)far;
        }
        public int getMiss() {
            return (int)miss;
        }
    }

    //i dont remember what this does actually
    //it imports into scoretextarea i guess
    public static void importComponent(double score, int pure, int far, int miss, double rating){


        //adds judgement data and score to array
        String text = "Score: " + (int) score + "\nPURE: " + pure + "\nFAR: " + far + "\nLOST: " + miss +"\nPlay Rating: "+rating;
        ScoreTextArea textArea = new ScoreTextArea(text, score, far, miss);
        scoreTextArray.add(textArea);

    }

    /*the way this script works is that it requires the selected variable name to be the exact same as the jacket file name.
    *unfortunately, sometimes some characters either cannot be used in filenames or im just too lazy to change it. so this "corrects"
    *any differences between filenames and string values without either field being compromised*/
    public static String checksum(String target){
        switch(target){
            case"Altair (feat. *spiLa*)":
                target = "Altair (feat. spiLa)";
                break;

            case"Can I Friend You on Bassbook? Lol":
                target ="Bassbook";
                break;

            case"Clotho and the stargazer (Eternal)":
                target ="Clotho and the stargazer";
                break;

            case"cocoro*cosmetic":
                target = "cocoro";
                break;

            case"Désive (Eternal)":
                target = "Désive";
                break;

            case"Distorted Fate (Eternal)":
                target = "Distorted Fate";
                break;

            case"Jingle (Eternal)":
                target = "Jingle";
                break;

            case"HELLOHELL (Eternal)":
                target = "HELLOHELL";
                break;

            case"Innocence (Eternal)":
                target = "Innocence";
                break;

            case"IONOSTREAM (Eternal)":
                target = "IONOSTREAM";
                break;

            case"MORNINGLOOM (Eternal)":
                target = "MORNINGLOOM";
                break;

            case"	͟͝͞Ⅱ́̕":
                target = "Ii";
                break;

            case"carmine:scythe":
                target="carmine scythe";
                break;

            case"Sayonara Hatsukoi (Eternal)":
                target="sayonara hatsukoi";
                break;

            case"Suomi (Eternal)":
                target="suomi";
                break;

            case"To: Alice Liddell":
                target="To Alice Liddell";
                break;

            case"Valhalla:0":
                target="valhalla0";
                break;

            case"Last | Moment":
                target="Last Moment";
                break;

            case"Last | Eternity":
                target="Last Eternity";
                break;

            default:
                break;
        }
        return target;
    }
}
