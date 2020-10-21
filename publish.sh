
rm -rf ~/.m2/repository/io/jvaas/jvaas-html
#rm -rf build

gradle build || exit
gradle publishToMavenLocal || exit

ls -lah ~/.m2/repository/io/jvaas/jvaas-html || exit

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-html gs://repo.jvaas.io/io/jvaas || exit



