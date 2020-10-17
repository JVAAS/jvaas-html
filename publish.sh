
rm -rf ~/.m2/repository/io/jvaas/jvaas-html
#rm -rf build

gradle build
gradle publishToMavenLocal

ls -lah ~/.m2/repository/io/jvaas/jvaas-html

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-html gs://repo.jvaas.io/io/jvaas



