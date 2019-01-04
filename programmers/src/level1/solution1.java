// 완주하지 못한 선수
//
/*
 * 1. 배열 비교 'participant'-complement
 * 2. 동일한 사람이 나올 경우  participant-participant
 */
package level1;

public class solution1 {
    public String solution(String[] participant, String[] completion) { 	
    	int n=participant.length;
    	String anwser="";   	
    	for(int i=0;i<n;i++) {
    		boolean check=false;
    		anwser=participant[i];
    		for(int j=0;j<n-1;j++)
    			if(anwser.equals(completion[j])) 
    				check=true;
    		for(int j=i+1;j<n;j++) 
    			if(anwser.equals(participant[j])) 
    				check=false;
    		if(!check)
    			return anwser;
    	}   	
    	return "";
    }
    
/*    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }*/

/*        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
            for (String player : completion) hm.put(player, hm.get(player) - 1);

            for (String key : hm.keySet()) {
                if (hm.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }*/

    
}
