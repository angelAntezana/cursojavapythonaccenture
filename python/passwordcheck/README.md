-Url para descargar archivo con contraseñas comprometidas: https://raw.githubusercontent.com/danielmiessler/SecLists/refs/heads/master/Passwords/Common-Credentials/xato-net-10-million-passwords-1000000.txt
-Comando:
wget https://raw.githubusercontent.com/danielmiessler/SecLists/refs/heads/master/Passwords/Common-Credentials/xato-net-10-million-passwords-1000000.txt -OutFile passwords.txt


Levantar api comandos:
uv run uvicorn passwordcheck.api:app --reload --host 127.0.0.1 --port 8000