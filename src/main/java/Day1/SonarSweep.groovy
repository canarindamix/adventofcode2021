package Day1

class SonarSweep {

    File f = new File("../../resources/day1Input.txt")
    def lines = f.readLines()

    Integer lastReading
    Integer nbOfIncreases

    void phase1() {
        lastReading = 0
        nbOfIncreases = 0

        lines.forEach(){reading ->
            if(Integer.parseInt(reading) > lastReading && lastReading != 0){
                nbOfIncreases++
            }
            lastReading = Integer.parseInt(reading)
        }

        println "Phase 1 answer is " + nbOfIncreases
    }

    void phase2(){

        lastReading = 0
        nbOfIncreases = 0
        Integer currentWindow = 0

        for(int i=0;i<=lines.size()-3;i++){
            currentWindow = Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(i+1)) + Integer.parseInt(lines.get(i+2))

            if (currentWindow > lastReading && lastReading != 0){
                nbOfIncreases++
            }
            lastReading = currentWindow
        }

        println "Phase 2 answer is " + nbOfIncreases
    }

}