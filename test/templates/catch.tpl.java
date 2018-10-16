import io.kuzzle.sdk.*;

public class CodeExampleGenericClass {
    private static Kuzzle kuzzle;

    public static void main(String[] args) {
      kuzzle = new Kuzzle("kuzzle");
      kuzzle.connect();
      try {
        [snippet-code]
      } catch (KuzzleException e) {
        System.out.println("Success");
      }
    }
}