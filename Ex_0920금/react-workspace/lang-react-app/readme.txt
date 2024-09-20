react-workspace에다 lang-react-app 만들기

URL 파라미터를 이용하여 다국어 지원을 위한 경로 만들기
- 경로 예시: /:lang/home lang 파라미터로 언어 코드를 받아서 해당 언어에 맞는 내용을 보여준다.

결과 확인
- 브라우저에서 /ko/home으로 접속하면 한국어 페이지가 표시된다.
- /en/home으로 접속하면 영어 페이지가 표시된다.
- /jp/home으로 접속하면 일본어 페이지가 표시된다.
- 지원하지 않는 언어 코드로 접속하면 오류 메시지가 표시된다.

  const content = {
    ko: {
      greeting: '안녕하세요!',
      description: '이것은 한국어 페이지입니다.',
    },
    en: {
      greeting: 'Hello!',
      description: 'This is an English page.',
    },
    jp: {
      greeting: 'こんにちは！',
      description: 'これは日本語のページです。',
    },
  };
  