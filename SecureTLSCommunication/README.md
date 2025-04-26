
# MSCS-535-Project4: Secure Communication System with TLS and MITM Protection

## 🔒 Project Overview
This project implements a **Secure Online Communication System** using **Spring Boot**, leveraging **TLS (Transport Layer Security)** to ensure encrypted communication and protection against **Man-in-the-Middle (MITM)** attacks. It demonstrates both RESTful API communication and a user-friendly web interface built with **Thymeleaf**.

---

## 🚀 Features
- ✅ Enforced HTTPS using TLS 1.3 / 1.2
- ✅ Strong cipher suites for secure encryption
- ✅ REST API for backend secure communication
- ✅ Polished Thymeleaf frontend UI
- ✅ Spring Security configuration for enhanced protection
- ✅ MITM attack prevention through proper TLS setup
- ✅ Self-signed certificate for development purposes

---

## 📂 Project Structure
```
SecureTLSCommunication/
├── src/main/java/com/sandesh/securetlscommunication/
│   ├── controller/
│   ├── config/
│   └── SecureTLSCommunication.java
├── src/main/resources/
│   ├── templates/          # Thymeleaf HTML
│   ├── certificates/       # Keystore for TLS
│   └── application.properties
├── build.gradle.kts
└── README.md
```

---

## ⚙️ Setup & Running the Project

### 1. Clone the Repository
```bash
git clone https://github.com/sanspokharel26677/MSCS-535-Project4.git
cd MSCS-535-Project4/SecureTLSCommunication
```

### 2. Generate Keystore (If Not Present)
```bash
keytool -genkeypair -alias serverkey -keyalg RSA -keysize 2048 \
-keystore src/main/resources/certificates/serverkeystore.jks -validity 365
```

### 3. Run the Application
```bash
./gradlew bootRun
```

The application will start on:
```
https://localhost:8443
```

---

## 🌐 Endpoints

| **Endpoint**                  | **Description**                |
|--------------------------------|--------------------------------|
| `GET /api/secure-message`      | Returns secure message (REST)  |
| `GET /secure-page`             | Loads Thymeleaf secure UI      |

Access via:
- `https://localhost:8443/api/secure-message`
- `https://localhost:8443/secure-page`

> ⚠️ **Note:** Since a self-signed certificate is used, browsers will show a security warning. Proceed to continue.

---

## 🛡️ MITM Protection Highlights
- Enforced **TLSv1.3/TLSv1.2**
- Disabled weak protocols & ciphers
- Spring Security enforcing HTTPS
- Secure HTTP headers enabled by default
- All communications encrypted end-to-end

---

## 📸 Screenshots
> _Place screenshots here showing:_
- Browser accessing `/secure-page`
- REST API response
- TLS warning (self-signed cert)
- IntelliJ console logs showing HTTPS startup

---

## 📖 References
- [Spring Boot SSL Docs](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#application-properties-server.server.ssl)
- [OWASP TLS Best Practices](https://cheatsheetseries.owasp.org/cheatsheets/Transport_Layer_Protection_Cheat_Sheet.html)
- [Java Keytool Guide](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/keytool.html)
