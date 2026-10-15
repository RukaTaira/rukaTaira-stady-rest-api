# --- ビルドステージ ---
FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /app

# taira（親pom.xml、rest、domain）のコードをコピー
COPY taira/ .

# rest モジュールのビルド（-pl で対象モジュールを指定、-am で依存関係を合わせてビルド）
RUN mvn clean package -pl rest -am -DskipTests

# --- 実行ステージ ---
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Mavenでビルドされたjarファイルをコピー
COPY --from=builder /app/rest/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
