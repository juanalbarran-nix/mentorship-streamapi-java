# mentorship-streamapi-java/devenv.nix
{pkgs, ...}: let
  application_name = "mentorship-streamapi-java";
in {
  # https://devenv.sh/basics/
  env.GREET = "Java Stream API mentorship exercises";
  env.application_name = application_name;

  languages.java = {
    enable = true;
    jdk.package = pkgs.jdk21;
    maven.enable = true;
    lsp.enable = false;
  };

  enterShell = ''
    echo "--- $GREET ---"
    java -version
    mvn -version
  '';
}
