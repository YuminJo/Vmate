<script lang="ts">
	import { i18n } from '$lib/i18n';
	import { ParaglideJS } from '@inlang/paraglide-sveltekit';
	import '../app.css';
	let { children } = $props();
</script>

<ParaglideJS {i18n}>
	{@render children()}
</ParaglideJS>

<header>
	<a href="/">slog</a>
	<a href="/member/login">로그인</a>
	<a href="/member/join">회원가입</a>
	<a href="/p/list">글</a>
</header>
<main>{@render children()}</main>
<footer>푸터</footer>
