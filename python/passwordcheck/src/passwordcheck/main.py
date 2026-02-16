from passwordcheck.util_texto.data.passwords import validar_password

def main() -> None:
    ok, mes = validar_password("jordan23", modo = "cache")
    print(f"ok={ok} -> {mes}")

if __name__ == "__main__":
    main()