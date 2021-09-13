public class mp3_player extends Player{


    public static void main(String ar[]){
        mp3_player my_mp3 = new mp3_player();
        my_mp3.play("사랑은 꽃보다 아름다워");
        my_mp3.pause();
        my_mp3.stop();
    }

    @Override
    void play(String songName) {
        System.out.println(songName + "을(를) 실행합니다.");
    }

    @Override
    void pause() {
        System.out.println("곡을 일시정지합니다.");
    }

    @Override
    void stop() {
        System.out.println("곡을 정지합니다.");
    }
}
